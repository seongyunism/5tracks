/*!
 * Start Bootstrap - Grayscale Bootstrap Theme (http://startbootstrap.com)
 * Code licensed under the Apache License v2.0.
 * For details, see http://www.apache.org/licenses/LICENSE-2.0.
 */

// jQuery to collapse the navbar on scroll
$(window).scroll(function() {
    if ($(".navbar").offset().top > 50) {
        $(".navbar-fixed-top").addClass("top-nav-collapse");
    } else {
        $(".navbar-fixed-top").removeClass("top-nav-collapse");
    }
});

// jQuery for page scrolling feature - requires jQuery Easing plugin
$(function() {
    $('a.page-scroll').bind('click', function(event) {
        var $anchor = $(this);
        $('html, body').stop().animate({
            scrollTop: $($anchor.attr('href')).offset().top
        }, 1500, 'easeInOutExpo');
        event.preventDefault();
    });
    
    $("div.tags span.tag").click(function() {
    	alert("Test");
    });

    // 검색 버튼 클릭 시 이벤트 처리
    $("header.intro div.intro-body input.songSearchBtn").click(function() {
    
		var action = "song?action=searchSong";
		var inputSongKeyword = "inputSongKeyword=" + $("header.intro div.intro-body input.songSearch").val();
		
		$.ajax({
			type : "POST",
			url : action,
			data : inputSongKeyword,
			dataType : "json",
			success: function(response) {
				if(response.countSongs != 0) {
					$("#player").animate({"top":"50%"}, 1000);
					$("#player div.player-section div.bgm div.title span.subject").text(response.searchedSongs[0].ftSongSubject);
					$("#player div.player-section div.bgm div.title span.artist").text("(" + response.searchedSongs[0].ftSongArtist + ")");
					$("#player div.player-section div.bgm audio.playing").attr("src", response.searchedSongs[0].ftSongDownloadLink);
					$("#player div.player-section div.bgm audio.playing").trigger("play");
					
					var songs = "";
					
					for(i=0; i<response.countSongs; i++) {
						var song = "<div class='songView'><div class='left'><img src='http://5tracks.890313.com/Files/covers/" + response.searchedSongs[i].ftSongCoverLink + "' /></div><div class='right'><div class='subject'>" + response.searchedSongs[i].ftSongSubject + "</div><div class='artist'>" + response.searchedSongs[i].ftSongArtist + "</div></div></div>";
						songs += song;
					}
					
					$("#player div.player-section div.list").html(songs);
					
				} else {
					alert("검색된 음악이 없습니다.");					
				}
				
				
			}, error: function(xhr,status,error) {
				alert(error);
			}
		});
    });
	
    // 닫기 버튼 클릭 시 이벤트 처리
    $("#player div.player-section div.button div.close").click(function() {
    	$("#player div.player-section div.bgm audio.playing").attr("src", "");
    	$("#player").animate({"top":"100%"}, 500);
    });

});

// Closes the Responsive Menu on Menu Item Click
$('.navbar-collapse ul li a').click(function() {
    $('.navbar-toggle:visible').click();
});


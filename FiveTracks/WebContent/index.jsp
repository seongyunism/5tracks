<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko">

<head>
    <title>5Tracks Music Curator</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=750, initial-scale=0.5, user-scalable=no" />
    <meta name="apple-mobile-web-app-capable" content="yes" />
    <meta name="description" content="5Tracks Music Curator" />
    <meta name="author" content="@seongyunism, @jiiseung" />
    <link href="include/css/bootstrap.min.css" rel="stylesheet">
    <link href="include/css/style.css" rel="stylesheet">
</head>

<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">

    <!-- Navigation -->
    <nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-main-collapse">
                    <i class="fa fa-bars"></i>
                </button>
                <a class="navbar-brand page-scroll" href="#page-top">
                    <i class="fa fa-play-circle"></i>&nbsp;5Tracks
                </a>
            </div>

            <div class="collapse navbar-collapse navbar-right navbar-main-collapse">
                <ul class="nav navbar-nav">
                    <!-- Hidden li included to remove active class from about link when scrolled up past about section -->
                    <li class="hidden">
                        <a href="#page-top"></a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#about">About</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#download">Download</a>
                    </li>
                    <li>
                        <a class="page-scroll" href="#contact">Contact</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container -->
    </nav>

	<!-- Music Player -->
	<section id="player">
		<div class="player-section">
			<div class="button">
				<div class="close"><span class="text">닫기</span></div>
			</div>
			<div class="bgm">
				<div class="title">♬ <span class="subject"></span> <span class="artist"></span></div>
				<audio class="playing" src=""></audio>
			</div>
			<div class="list"></div>

		</div>
	</section>

    <!-- Intro Header -->
    <header class="intro">
        <div class="intro-body">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-md-offset-2">
                        <h1 class="brand-heading">5Tracks</h1>
                        <p class="intro-text">오늘은 이런 음악 어때요?</p>
                        <div class="selectedTags"></div>
                        
                        <form>
                        	<input type="text" name="inputSongKeyword" class="songSearch" /><input type="button" value="검색" class="songSearchBtn" />
                        </form>
                        
                        <div class="tags">
                        	<!-- 태그 랜덤 출력 -->
	                        <span class="tag">#비오는날</span>
	                        <span class="tag">#여름</span>
	                        <span class="tag">#혼자</span>
	                        <span class="tag">#배고파</span>

                        </div>

                        <a href="#about" class="btn btn-circle page-scroll">
                            <i class="fa fa-angle-double-down animated"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </header>

    <!-- About Section -->
    <section id="about" class="container content-section text-center">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <h2>About 5Tracks</h2>
                <p><span style="color:#3267b5">5Tracks</span>란 사용자가 원하는 음악을 자동으로 큐레이팅하여<br />사용자에게 제공하는 <span style="color:#3267b5">신개념 스트리밍 뮤직 플랫폼</span>입니다.</p>
                <p><span style="font-size:1.7em; color:#42dca3">5Tracks</span>는,</p>
                <p>음악의 제목이나 아티스트명 뿐만 아니라<br />청취자의 기분, 현재 있는 장소, 분위기, 가사내용 등<br />다양한 카테고리를 지정하여 큐레이팅한 음악을<br />사용자에게 제공할 수 있습니다.</p>
                <p>사용자가 선택할 수 있는 카테고리를<br />다수로 지정할 수 있게 하여<br />사용자가 현재 듣고 싶어하는 음악에<br />최대한 근접한 음악을 제공할 수 있습니다.</p>
                <p>만약 사용자가 원하는 카테고리가 없을 경우,<br />사용자가 직접 새로운 카테고리를 추가할 수 있도록 하여<br />폭넑은 음악 감상의 기회를 제공할 수 있습니다.</p> 
            </div>
        </div>
    </section>

    <!-- Download Section -->
    <section id="download" class="content-section text-center">
        <div class="download-section">
            <div class="container">
                <div class="col-lg-8 col-lg-offset-2">
                    <h2>Download 5Tracks</h2>
                    <p style="color:#000000; text-shadow:1px 1px 5px rgba(255, 255, 255, 0.3);">모바일 애플리케이션에서도 <span style="color:#3267b5">5Tracks</span>를 즐겨보세요! </p>
                    <a href="#" class="btn btn-default btn-lg">Download Android 5Tracks</a><br /><br />
                    <a href="#" class="btn btn-default btn-lg">Download iOS 5Tracks</a>
                </div>
            </div>
        </div>
    </section>

    <!-- Contact Section -->
    <section id="contact" class="container content-section text-center">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2">
                <h2>Contact 5Tracks</h2>
                <p><span style="color:#3267b5">5Tracks</span>에 관해 궁금한 사항이 있다면<br />망설임없이 연락주세요!</p>

				<table class="profiles">
					<tr>
						<td>&nbsp;</td>
						<td class="profile"><img src="include/img/profile-seongyunism.jpg" /></td>
						<td>&nbsp;</td>
						<td class="profile"><img src="include/img/profile-jiiseung.jpg" /></td>
						<td>&nbsp;</td>
					</tr>
					<tr>
						<td></td>
						<td class="email"><a href="mailto:goodjsg@naver.com">@seongyunism</a></td>					
						<td></td>						
						<td class="email"><a href="mailto:chazevo@naver.com">@jiiseung</a></td>						
						<td></td>						
				</table>

            </div>
        </div>
    </section>

    <!-- Footer -->
    <footer>
        <div class="container text-center">
            <p>Copyright &copy; 5Tracks 2015</p>
        </div>
    </footer>

    <!-- jQuery -->
    <script src="include/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="include/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="include/js/jquery.easing.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="include/js/script.js"></script>

</body>

</html>

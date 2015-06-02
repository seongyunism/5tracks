package fivetracks.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import fivetracks.model.SongDAO;
import fivetracks.model.domain.Song;

public class SongController extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		process(req, res);
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		process(req, res);
	}
	
	public void process(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		req.setCharacterEncoding("utf-8");
		String action = req.getParameter("action");
		
		if (action.equals("searchSong")) {
			searchSong(req, res);
		}
	}

	public void searchSong(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {

		res.setCharacterEncoding("UTF-8");
		
		try {
			ArrayList<Song> searchedSongs = new ArrayList<Song>();
			ArrayList<Song> checkSongSubject = new ArrayList<Song>();
			ArrayList<Song> checkSongArtistName = new ArrayList<Song>();
			ArrayList<Song> checkSongTagsName = new ArrayList<Song>();
			ArrayList<Song> checkSongCountryName = new ArrayList<Song>();
			
			JSONObject jObject = new JSONObject();
			JSONArray jArray = new JSONArray();
		
			String inputSongKeyword = (req.getParameter("inputSongKeyword") != null) ? req.getParameter("inputSongKeyword") : "";
			if(inputSongKeyword == "") {
				jObject.put("checked", "false");
				jObject.put("countSongs", 0);
				
				res.setContentType("application/json");
				res.getWriter().write(jObject.toString());		
				
				return;
			}

			// 곡명으로 검색한 결과 삽입
			checkSongSubject = SongDAO.searchSongSubject(inputSongKeyword);			
			for(int i=0; i<checkSongSubject.size(); i++) { 
				searchedSongs.add(checkSongSubject.get(i)); // 통합리스트에 결과 삽입
			}
			
			// 아티스트명으로 검색한 결과 삽입
			
			// 태그명으로 검색한 결과 삽입
			
			// 국가명으로 검색한 결과 삽입
			
			// 중복 제거
			HashSet hashSet = new HashSet(searchedSongs);
			ArrayList<Song> resultSongs = new ArrayList<Song>(hashSet);

			for(int i=0; i<resultSongs.size(); i++) {
				JSONObject tempSong = new JSONObject();
				
				tempSong.put("pfNo", resultSongs.get(i).getFtNo());
				tempSong.put("ftSongSubject", resultSongs.get(i).getFtSongSubject());
				tempSong.put("ftSongArtist", SongDAO.searchSongArtist(resultSongs.get(i).getFtSongArtist()));
				tempSong.put("ftSongCategory01", resultSongs.get(i).getFtSongCategory01());
				tempSong.put("ftSongCategory02", resultSongs.get(i).getFtSongCategory02());
				tempSong.put("ftSongCategory03", resultSongs.get(i).getFtSongCategory03());
				tempSong.put("ftSongCategory04", resultSongs.get(i).getFtSongCategory04());
				tempSong.put("ftSongCategory05", resultSongs.get(i).getFtSongCategory05());
				tempSong.put("ftSongDownloadLink", "http://5tracks.890313.com/Files/musics/" + SongDAO.searchSongDownloadLink(resultSongs.get(i).getFtSongDownloadLink()));
				tempSong.put("ftSongCoverLink", SongDAO.searchSongCoverLink(resultSongs.get(i).getFtSongDownloadLink()));
				
				jArray.add(tempSong);				
			}
			
			if(searchedSongs.size() > 0) {
				jObject.put("checked", "true");
				jObject.put("countSongs", searchedSongs.size());
				jObject.put("searchedSongs", jArray);
				
			} else {
				jObject.put("checked", "false");
				jObject.put("countSongs", 0);
			}
			
			res.setContentType("application/json");
			res.getWriter().write(jObject.toString());
			
		} catch (SQLException e) {
			req.setAttribute("errorMsg", "ERROR : 포스트 가져오기 실패! (SQL에러)");
		}
		
	}
	
}

package fivetracks.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import fivetracks.model.domain.Song;
import fivetracks.util.DBUtil;

public class SongDAO {

	public static ArrayList<Song> searchSongSubject(String inputSongKeyword) throws SQLException {

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		Song thisSong;
		ArrayList<Song> thisList = new ArrayList<Song>();

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("SELECT * FROM ft_songs WHERE ftSongSubject LIKE CONCAT('%',?,'%')");
			pstmt.setString(1, inputSongKeyword);
			rset = pstmt.executeQuery();	
			
			while(rset.next()) {
				
				thisSong = new Song(
					rset.getInt(1),		// int ftNo
					rset.getString(2),	// String ftSongSubject 
					rset.getInt(3),		// int ftSongArtist - index
					rset.getInt(4),		// int ftSongCategory01 - index
					rset.getInt(5),		// int ftSongCategory02 - index
					rset.getInt(6),		// int ftSongCategory03 - index
					rset.getInt(7),		// int ftSongCategory04 - index
					rset.getInt(8),		// int ftSongCategory05 - index
					rset.getInt(9)		// int ftSongDownloadLink - index
				);
				
				thisList.add(thisSong);
			}
		
			return thisList;
			
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;

		} finally {
			try {
				DBUtil.close(con, pstmt, rset);
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
	}

	public static String searchSongDownloadLink(int inputSong) throws SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String thisSongDownloadLink = "";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("SELECT * FROM ft_songs_download WHERE ftNo=?");
			pstmt.setInt(1, inputSong);
			rset = pstmt.executeQuery();	
			
			while(rset.next()) {
				thisSongDownloadLink = rset.getString(3);
			}
			
			return thisSongDownloadLink;
			
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;

		} finally {
			try {
				DBUtil.close(con, pstmt, rset);
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
	}

	public static String searchSongArtist(int inputArtist) throws SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String thisSongArtist = "";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("SELECT * FROM ft_artists WHERE ftNo=?");
			pstmt.setInt(1, inputArtist);
			rset = pstmt.executeQuery();	
			
			while(rset.next()) {
				thisSongArtist = rset.getString(2);
			}
			
			return thisSongArtist;
			
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;

		} finally {
			try {
				DBUtil.close(con, pstmt, rset);
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
	}

	public static String searchSongCoverLink(int inputArtist) throws SQLException {
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String thisSongCoverLink = "";

		try {
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement("SELECT * FROM ft_songs_cover WHERE ftNo=?");
			pstmt.setInt(1, inputArtist);
			rset = pstmt.executeQuery();	
			
			while(rset.next()) {
				thisSongCoverLink = rset.getString(2);
			}
			
			return thisSongCoverLink;
			
		} catch (SQLException se) {
			se.printStackTrace();
			throw se;

		} finally {
			try {
				DBUtil.close(con, pstmt, rset);
			} catch (SQLException sqle) {
				sqle.printStackTrace();
			}
		}
	}
	
}

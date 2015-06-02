package fivetracks.model.domain;

public class Song {

	private int ftNo;
	private String ftSongSubject;
	private int ftSongArtist;
	private int ftSongCategory01;
	private int ftSongCategory02;
	private int ftSongCategory03;
	private int ftSongCategory04;
	private int ftSongCategory05;
	private int ftSongDownloadLink;
	
	public int getFtNo() {
		return ftNo;
	}
	public void setFtNo(int ftNo) {
		this.ftNo = ftNo;
	}
	public String getFtSongSubject() {
		return ftSongSubject;
	}
	public void setFtSongSubject(String ftSongSubject) {
		this.ftSongSubject = ftSongSubject;
	}
	public int getFtSongArtist() {
		return ftSongArtist;
	}
	public void setFtSongArtist(int ftSongArtist) {
		this.ftSongArtist = ftSongArtist;
	}
	public int getFtSongCategory01() {
		return ftSongCategory01;
	}
	public void setFtSongCategory01(int ftSongCategory01) {
		this.ftSongCategory01 = ftSongCategory01;
	}
	public int getFtSongCategory02() {
		return ftSongCategory02;
	}
	public void setFtSongCategory02(int ftSongCategory02) {
		this.ftSongCategory02 = ftSongCategory02;
	}
	public int getFtSongCategory03() {
		return ftSongCategory03;
	}
	public void setFtSongCategory03(int ftSongCategory03) {
		this.ftSongCategory03 = ftSongCategory03;
	}
	public int getFtSongCategory04() {
		return ftSongCategory04;
	}
	public void setFtSongCategory04(int ftSongCategory04) {
		this.ftSongCategory04 = ftSongCategory04;
	}
	public int getFtSongCategory05() {
		return ftSongCategory05;
	}
	public void setFtSongCategory05(int ftSongCategory05) {
		this.ftSongCategory05 = ftSongCategory05;
	}
	public int getFtSongDownloadLink() {
		return ftSongDownloadLink;
	}
	public void setFtSongDownloadLink(int ftSongDownloadLink) {
		this.ftSongDownloadLink = ftSongDownloadLink;
	}
	
	public Song(int ftNo, String ftSongSubject, int ftSongArtist,
			int ftSongCategory01, int ftSongCategory02, int ftSongCategory03,
			int ftSongCategory04, int ftSongCategory05, int ftSongDownloadLink) {
		super();
		this.ftNo = ftNo;
		this.ftSongSubject = ftSongSubject;
		this.ftSongArtist = ftSongArtist;
		this.ftSongCategory01 = ftSongCategory01;
		this.ftSongCategory02 = ftSongCategory02;
		this.ftSongCategory03 = ftSongCategory03;
		this.ftSongCategory04 = ftSongCategory04;
		this.ftSongCategory05 = ftSongCategory05;
		this.ftSongDownloadLink = ftSongDownloadLink;
	}
	
}

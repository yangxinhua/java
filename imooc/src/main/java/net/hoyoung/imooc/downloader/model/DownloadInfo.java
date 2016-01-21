package net.hoyoung.imooc.downloader.model;

import org.apache.commons.lang.StringUtils;

import java.io.File;

public class DownloadInfo {
    //下载文件url
    private String url;
    //下载文件名称
    private String fileName;
    //下载文件路径
    private String filePath;
    //分成多少段下载， 每一段用一个线程完成下载
    private int splitter;
    
    private long length;
    
    //下载文件默认保存路径
    private final static String FILE_PATH = "C:/temp";
    //默认分块数、线程数
    private final static int SPLITTER_NUM = 5;
    
    private int progress = 0;

    private boolean downloading = false;

    public boolean isDownloading() {
        return downloading;
    }

    public void setDownloading(boolean downloading) {
        this.downloading = downloading;
    }

    public long getLength() {
		return length;
	}

	public void setLength(long length) {
		this.length = length;
	}

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public DownloadInfo() {
        super();
    }
    
    /**
     * @param url 下载地址
     */
    public DownloadInfo(String url) {
        this(url, null, null, SPLITTER_NUM);
    }
    
    /**
     * @param url 下载地址url
     * @param splitter 分成多少段或是多少个线程下载
     */
    public DownloadInfo(String url, int splitter) {
        this(url, null, null, splitter);
    }
    
    /***
     * @param url 下载地址
     * @param fileName 文件名称
     * @param filePath 文件保存路径
     * @param splitter 分成多少段或是多少个线程下载
     */
    public DownloadInfo(String url, String fileName, String filePath, int splitter) {
        super();
        if (url == null || "".equals(url)) {
            throw new RuntimeException("url is not null!");
        }
        this.url =  url;
        this.fileName = StringUtils.isEmpty(fileName) ? getFileName(url) : fileName;
        this.filePath = StringUtils.isEmpty(filePath) ? FILE_PATH : filePath;
        this.splitter = (splitter < 1) ? SPLITTER_NUM : splitter;
    }

    /**
     * 判断是否已经下载完成
     */
    public boolean hasDownload(){
        String fullName = this.filePath+ File.separator+this.fileName;
        //文件存在，并且记录进度信息的文件不存在
        if(new File(fullName).exists()&&!new File(fullName+".position").exists()){
            return true;
        }
        return false;
    }

    /**
     * 得到记录进度信息文件的名称
     * @return
     */
    public String getPosMarkerFile(){

        return this.filePath+ File.separator+this.fileName+".position";
    }
    /**
     * <b>function:</b> 通过url获得文件名称
     * @author hoojo
     * @createDate 2011-9-30 下午05:00:00
     * @param url
     * @return
     */
    private String getFileName(String url) {
        return url.substring(url.lastIndexOf("/") + 1, url.length());
    }
    
    public String getUrl() {
        return url;
    }
 
    public void setUrl(String url) {
        if (url == null || "".equals(url)) {
            throw new RuntimeException("url is not null!");
        }
        this.url = url;
    }
 
    public String getFileName() {
        return fileName;
    }
 
    public void setFileName(String fileName) {
        this.fileName = (fileName == null || "".equals(fileName)) ? getFileName(url) : fileName;
    }
 
    public String getFilePath() {
        return filePath;
    }
 
    public void setFilePath(String filePath) {
        this.filePath = (filePath == null || "".equals(filePath)) ? FILE_PATH : filePath;
    }
 
    public int getSplitter() {
        return splitter;
    }
 
    public void setSplitter(int splitter) {
        this.splitter = (splitter < 1) ? SPLITTER_NUM : splitter;
    }

    @Override
    public String toString() {
        return "DownloadInfo{" +
                "url='" + url + '\'' +
                ", fileName='" + fileName + '\'' +
                ", filePath='" + filePath + '\'' +
                ", splitter=" + splitter +
                ", length=" + length +
                ", progress=" + progress +
                ", downloading=" + downloading +
                '}';
    }
}
package com.wyk.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Danmaku {
    private Integer danmakuId;

    private Integer danmakuVideoid;

    private Integer danmakuVideotime;

    private String danmakuStringTime;

    private String danmakuContent;

    private String danmakuColor;

    private Integer danmakuType;

    private String stringtype;

    private Integer danmakuFontsize;

    private Integer danmakuSenderid;

    private Date danmakuSendtime;

    private String stringSendtime;


    private String stringLongSendtime;

    private Integer danmakuStatus;

    private String stringstatus;

    private User sender;

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Integer getDanmakuId() {
        return danmakuId;
    }

    public void setDanmakuId(Integer danmakuId) {
        this.danmakuId = danmakuId;
    }

    public Integer getDanmakuVideoid() {
        return danmakuVideoid;
    }

    public void setDanmakuVideoid(Integer danmakuVideoid) {
        this.danmakuVideoid = danmakuVideoid;
    }

    public Integer getDanmakuVideotime() {
        return danmakuVideotime;
    }

    public void setDanmakuVideotime(Integer danmakuVideotime) {
        this.danmakuVideotime = danmakuVideotime;
    }

    public String getDanmakuContent() {
        return danmakuContent;
    }

    public void setDanmakuContent(String danmakuContent) {
        this.danmakuContent = danmakuContent == null ? null : danmakuContent.trim();
    }

    public String getDanmakuColor() {
        return danmakuColor;
    }

    public void setDanmakuColor(String danmakuColor) {
        this.danmakuColor = danmakuColor == null ? "#000000" : danmakuColor.trim();
    }

    public Integer getDanmakuType() {
        return danmakuType;
    }

    public void setDanmakuType(Integer danmakuType) {
        this.danmakuType = danmakuType;
    }

    public Integer getDanmakuFontsize() {
        return danmakuFontsize;
    }

    public void setDanmakuFontsize(Integer danmakuFontsize) {
        this.danmakuFontsize = danmakuFontsize;
    }

    public Integer getDanmakuSenderid() {
        return danmakuSenderid;
    }

    public void setDanmakuSenderid(Integer danmakuSenderid) {
        this.danmakuSenderid = danmakuSenderid;
    }

    public Date getDanmakuSendtime() {
        return danmakuSendtime;
    }

    public void setDanmakuSendtime(Date danmakuSendtime) {
        this.danmakuSendtime = danmakuSendtime;
    }

    public Integer getDanmakuStatus() {
        return danmakuStatus;
    }

    public void setDanmakuStatus(Integer danmakuStatus) {
        this.danmakuStatus = danmakuStatus;
    }

    public String getDanmakuStringTime() {
        int Time = danmakuVideotime;
        int MM = Time / 600;
        int SS = Time % 600;
        String StrTime = "";
        if (MM < 100)
            StrTime = StrTime + "0";
        StrTime = StrTime + MM + ":";
        if (SS < 100)
            StrTime = StrTime + "0";
        StrTime = StrTime + SS / 10;

        return StrTime;
    }

    public void setDanmakuStringTime() {
        this.danmakuStringTime = getDanmakuStringTime();
    }

    public String getStringtype() {
        if (danmakuType == 1)
            return "顶部";
        else if (danmakuType == 2)
            return "底部";
        else
            return "普通";
    }

    public void setStringtype(String stringtype) {
        this.stringtype = stringtype;
    }

    public String getStringSendtime() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm");
        return sdf.format(getDanmakuSendtime());
    }

    public void setStringSendtime(String stringSendtime) {
        stringSendtime = stringSendtime;
    }

    public String getStringLongSendtime() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(getDanmakuSendtime());
    }

    public void setStringLongSendtime(String stringLongSendtime) {
        stringLongSendtime = stringLongSendtime;
    }

    public String getStringstatus() {
        if (danmakuStatus == 0)
            return "正常";
        else if (danmakuStatus == 1)
            return "隐藏";
        else
            return "违规";
    }

    public void setStringstatus(String stringstatus) {
        this.stringstatus = stringstatus;
    }

    @Override
    public String toString() {
        return "Danmaku{" +
                "danmakuId=" + danmakuId +
                ", danmakuVideoid=" + danmakuVideoid +
                ", danmakuVideotime=" + danmakuVideotime +
                ", danmakuStringTime='" + danmakuStringTime + '\'' +
                ", danmakuContent='" + danmakuContent + '\'' +
                ", danmakuColor='" + danmakuColor + '\'' +
                ", danmakuType=" + danmakuType +
                ", stringtype='" + stringtype + '\'' +
                ", danmakuFontsize=" + danmakuFontsize +
                ", danmakuSenderid=" + danmakuSenderid +
                ", danmakuSendtime=" + danmakuSendtime +
                ", stringSendtime='" + stringSendtime + '\'' +
                ", stringLongSendtime='" + stringLongSendtime + '\'' +
                ", danmakuStatus=" + danmakuStatus +
                ", stringstatus='" + stringstatus + '\'' +
                ", sender=" + sender +
                '}';
    }
}

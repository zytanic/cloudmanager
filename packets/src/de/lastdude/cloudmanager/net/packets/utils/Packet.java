package de.lastdude.cloudmanager.net.packets.utils;

public abstract class Packet {
    protected int packetID = 0;
    protected String packetName = "";
    protected byte[] packetdata = null;
    protected Class packetclass = null;
    public int getPacketID() {
        return this.packetID;
    }

    public String getPacketName() {
        return this.packetName;
    }

    public byte[] getPacketdata() {
        return this.packetdata;
    }

    public Class getPacketclass() {
        return this.packetclass;
    }

    public void setPacketID(int packetID) {
        this.packetID = packetID;
    }

    public void setPacketName(String packetName) {
        this.packetName = packetName;
    }

    public void setPacketdata(byte[] packetdata) {
        this.packetdata = packetdata;
    }

    public void setPacketclass(Class packetclass) {
        this.packetclass = packetclass;
    }
}

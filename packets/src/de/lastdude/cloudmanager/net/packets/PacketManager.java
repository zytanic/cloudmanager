package de.lastdude.cloudmanager.net.packets;

import de.lastdude.cloudmanager.net.packets.utils.Packet;

import java.util.HashSet;

public class PacketManager {
    protected HashSet<Packet> registeredPackets = new HashSet<>();
    public void registerPacket(Packet packet) {
        registeredPackets.add(packet);
    }
    public void deregisterPacket(Packet packet) {
        registeredPackets.remove(packet);
    }
    public Integer getRegisteredPackets(Packet packet) {
        return registeredPackets.size();
    }
    public boolean isPacketRegistered(Packet packet) {
        return registeredPackets.contains(packet);
    }
    public Packet getPacketByID(int ID) {
        Packet resPacket = null;
        for (Packet packet : registeredPackets) {
            if (packet.getPacketID() == ID) {
                resPacket = packet;
            }
        }
        return resPacket;
    }
    public Packet getPacketByName(String packetname) {
        Packet resPacket = null;
        for (Packet packet : registeredPackets) {
            if (packet.getPacketName() == packetname) {
                resPacket = packet;
            }
        }
        return resPacket;
    }
}

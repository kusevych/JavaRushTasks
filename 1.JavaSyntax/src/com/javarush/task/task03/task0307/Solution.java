package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerga = new Zerg();
        zerga.name = "zerga";
        Zerg zergb = new Zerg();
        zergb.name = "zergb";
        Zerg zergc = new Zerg();
        zergc.name = "zergc";
        Zerg zergd = new Zerg();
        zergd.name = "zergd";
        Zerg zerge = new Zerg();
        zerge.name = "zerge";
        Protoss protossf = new Protoss();
        protossf.name = "protossf";
        Protoss protossg = new Protoss();
        protossg.name = "protossg";
        Protoss protossh = new Protoss();
        protossh.name = "protossh";
        Terran terrani = new Terran();
        terrani.name = "terrani";
        Terran terranj = new Terran();
        terranj.name = "terranj";
        Terran terrank = new Terran();
        terrank.name = "terrank";
        Terran terranl = new Terran();
        terranl.name = "terranl";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}

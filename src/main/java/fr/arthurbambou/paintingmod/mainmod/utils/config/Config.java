package fr.arthurbambou.paintingmod.mainmod.utils.config;

public class Config {
    public CompatConfig compat;
    public GeneralConfig general;

    public static class CompatConfig {
        public boolean fabriBlocksCompat;
    }

    public static class GeneralConfig {
        public int soggyClayDropNumber;
        public int heatGunDurability;
    }
}

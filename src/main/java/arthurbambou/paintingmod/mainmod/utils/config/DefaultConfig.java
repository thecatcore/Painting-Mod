package arthurbambou.paintingmod.mainmod.utils.config;

public class DefaultConfig extends Config {

    public DefaultConfig() {
        this.compat = new DefaultCompatConfig();
        this.general = new DefaultGeneralConfig();
    }

    public static class DefaultCompatConfig extends Config.CompatConfig {

        public DefaultCompatConfig() {
            this.fabriBlocksCompat = false;
        }
    }

    public static class DefaultGeneralConfig extends Config.GeneralConfig {
        public DefaultGeneralConfig() {
            this.heatGunDurability = 100;
            this.soggyClayDropNumber = 4;
        }
    }
}

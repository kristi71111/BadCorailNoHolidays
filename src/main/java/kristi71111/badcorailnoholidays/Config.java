package kristi71111.badcorailnoholidays;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.config.ModConfigEvent;

// An example config class. This is not required, but it's a good idea to have one to keep your config organized.
// Demonstrates how to use Forge's config APIs
@Mod.EventBusSubscriber(modid = BadCorailNoHolidays.modId, bus = Mod.EventBusSubscriber.Bus.MOD)
public class Config {
    public static final ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();
    private static final ForgeConfigSpec.BooleanValue isAprilFoolsDayEnabledConf = configBuilder
            .comment("Is Corail Tombstone april fools date logic enabled?")
            .define("isAprilFoolsDayEnabled", false);
    private static final ForgeConfigSpec.BooleanValue isDateAroundHalloweenConf = configBuilder
            .comment("Is Corail Tombstone halloween date logic enabled?")
            .define("isHalloweenEnabled", false);
    private static final ForgeConfigSpec.BooleanValue isDateAroundChristmasConf = configBuilder
            .comment("Is Corail Tombstone christmas date logic enabled?")
            .define("isChristmasEnabled", false);
    private static final ForgeConfigSpec.BooleanValue isDateAroundEasterConf = configBuilder
            .comment("Is Corail Tombstone easter date logic enabled?")
            .define("isEasterEnabled", false);
    public static final ForgeConfigSpec SPEC = configBuilder.build();
    public static boolean isAprilFoolsDayEnabled;
    public static boolean isDateAroundHalloween;
    public static boolean isDateAroundChristmas;
    public static boolean isDateAroundEaster;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        isAprilFoolsDayEnabled = isAprilFoolsDayEnabledConf.get();
        isDateAroundHalloween = isDateAroundHalloweenConf.get();
        isDateAroundChristmas = isDateAroundChristmasConf.get();
        isDateAroundEaster = isDateAroundEasterConf.get();
    }
}

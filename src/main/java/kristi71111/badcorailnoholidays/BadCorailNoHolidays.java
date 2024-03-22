package kristi71111.badcorailnoholidays;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(BadCorailNoHolidays.modId)
public class BadCorailNoHolidays {

    public static final String modId = "badcorailnoholidays";
    private static final Logger logger = LogUtils.getLogger();

    public BadCorailNoHolidays() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

}

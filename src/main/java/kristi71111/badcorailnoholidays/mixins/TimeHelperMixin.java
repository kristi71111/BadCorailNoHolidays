package kristi71111.badcorailnoholidays.mixins;

import kristi71111.badcorailnoholidays.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import ovh.corail.tombstone.helper.TimeHelper;

@Mixin(value = TimeHelper.class)
public abstract class TimeHelperMixin {
    @Inject(method = "isAprilFoolsDay()Z", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injectedIsAprilFoolsDay(CallbackInfoReturnable<Boolean> cir) {
        if (!Config.isAprilFoolsDayEnabled) {
            cir.setReturnValue(false);
        }
    }

    @Inject(method = "isDateAroundHalloween()Z", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injectedIsDateAroundHalloween(CallbackInfoReturnable<Boolean> cir) {
        if (!Config.isDateAroundHalloweenEnabled) {
            cir.setReturnValue(false);
        }
    }

    @Inject(method = "isDateAroundChristmas()Z", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injectedIsDateAroundChristmas(CallbackInfoReturnable<Boolean> cir) {
        if (!Config.isDateAroundChristmasEnabled) {
            cir.setReturnValue(false);
        }
    }

    @Inject(method = "isDateAroundEaster()Z", at = @At("HEAD"), cancellable = true, remap = false)
    private static void injectedIsDateAroundEaster(CallbackInfoReturnable<Boolean> cir) {
        if (!Config.isDateAroundEasterEnabled) {
            cir.setReturnValue(false);
        }
    }

}

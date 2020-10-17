package com.hugman.dawn.mod.init;

import com.hugman.dawn.api.creator.EffectCreator;
import com.hugman.dawn.mod.object.effect.HiccupEffect;
import com.hugman.dawn.mod.object.effect.SimpleEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class DawnEffectPack extends DawnPack {
	public static final StatusEffect HEAVINESS = register(new EffectCreator.Builder("heaviness", new SimpleEffect(StatusEffectType.HARMFUL, 9198906)));
	public static final StatusEffect HICCUP = register(new EffectCreator.Builder("hiccup", new HiccupEffect(StatusEffectType.NEUTRAL, 9198906)));
}
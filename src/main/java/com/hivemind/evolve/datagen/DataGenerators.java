/*
 * SPDX-FileCopyrightText: 2022 klikli-dev
 *
 * SPDX-License-Identifier: MIT
 */

package com.hivemind.evolve.datagen;

import com.hivemind.evolve.Evolve;
import com.hivemind.evolve.datagen.lang.EnUsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        generator.addProvider(event.includeClient(), new BlocksStateProvider(generator, helper));
        generator.addProvider(event.includeClient(), new ItemModelProvider(generator, helper));
        generator.addProvider(event.includeClient(), new LootTableProvider(generator));
        generator.addProvider(event.includeClient(), new RecipeProvider(generator));

        var lang =  new EnUsProvider(generator);
        generator.addProvider(event.includeServer(), new EvolveBookProvider(generator, Evolve.MOD_ID, lang));
        //Important: Lang provider needs to be added after the book provider to process the texts added by the book provider
        generator.addProvider(event.includeClient(), lang);
    }
}
package addonname_dtn.forge_imitate.event;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry.TexturedModelDataProvider;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class EntityRenderersEvent {
    
    public static class RegisterLayerDefinitions {

        public RegisterLayerDefinitions() {
            
        }

        public void registerLayerDefinition(ModelLayerLocation modelLayer, TexturedModelDataProvider provider) {
            EntityModelLayerRegistry.registerModelLayer(modelLayer, provider);
        }

    }
}

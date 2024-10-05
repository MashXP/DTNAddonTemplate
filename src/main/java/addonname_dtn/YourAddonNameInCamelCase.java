package addonname_dtn;
import org.joml.Vector3f;

import doggytalents.api.events.RegisterCustomDogModelsEvent;
import doggytalents.api.events.RegisterDogSkinJsonPathEvent;
import doggytalents.api.events.RegisterCustomDogModelsEvent.DogModelProps.Builder;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModLoadingContext;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.client.event.EntityRenderersEvent.RegisterLayerDefinitions;
import addonname_dtn.models.YourDogDerootedModel;

@Mod(Constants.MOD_ID)
public class YourAddonNameInCamelCase {

    public YourAddonNameInCamelCase() {
        IEventBus modEventBus = ModLoadingContext.get().getActiveContainer().getEventBus();
        if (FMLEnvironment.dist == Dist.CLIENT) {
            modEventBus.addListener(YourAddonNameInCamelCase::registeringSkin);
            modEventBus.addListener(YourAddonNameInCamelCase::registeringSkinJson);
            modEventBus.addListener(YourAddonNameInCamelCase::registerLayerDefinition);
        };

    }

    public static void registeringSkin(RegisterCustomDogModelsEvent event) {
        event.register(new Builder(getRes("dogmodelname"), ModelLayerLocations.YOUR_DOG_MODEL));

    //CUSTOMIZABLE REGISTERS
        // event.register(new Builder(getRes("chihuahua"), ModelLayerLocations.CHIHUAHUA)
        //     .withDefaultScale(0.704f));

        // event.register(new Builder(getRes("wolf"), ModelLayerLocations.BD_WOLF)
        //     .withGlowingEyes());

        // event.register(new Builder(getRes("pomeranian"), ModelLayerLocations.POMERANIAN)
        //     .withCustomRootPivot(new Vector3f(0, 17, 0)));
       
    }

    public static void registeringSkinJson(RegisterDogSkinJsonPathEvent event) {
        event.register(Constants.SKIN_JSON_PATH);
    }

    public static void registerLayerDefinition(RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModelLayerLocations.YOUR_DOG_MODEL, YourDogDerootedModel::createBodyLayer); 
        //The error should go away if you registered your dog model correctly!)
   }

    public static ResourceLocation getRes(String name) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, name);
    }
    
}

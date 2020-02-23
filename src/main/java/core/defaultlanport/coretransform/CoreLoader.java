package core.defaultlanport.coretransform;

import java.util.Map;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

@IFMLLoadingPlugin.MCVersion("1.14.4")
@IFMLLoadingPlugin.TransformerExclusions(value = "core.defaultlanport.coretransform.")
@IFMLLoadingPlugin.Name(CoreLoader.MOD_NAME)
@IFMLLoadingPlugin.SortingIndex(value = 999)
@Mod(modid = CoreLoader.MOD_ID, name = CoreLoader.MOD_NAME, version = CoreLoader.MOD_VERSION, acceptableRemoteVersions = "*", useMetadata = true)
public class CoreLoader implements IFMLLoadingPlugin {
	
	public static final String MOD_ID = "defaultlanport";
	public static final String MOD_NAME = "Default LAN Port";
	public static final String MOD_VERSION = "1.2 (Forge 1.14.4)";
	public static boolean isObfuscated;
	
	@Override
	public String[] getASMTransformerClass() {
		return new String[]{CoreTransformer.class.getName()};
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		isObfuscated = (Boolean) data.get("runtimeDeobfuscationEnabled");
	}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}

}

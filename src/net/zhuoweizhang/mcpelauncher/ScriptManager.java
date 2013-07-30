package net.zhuoweizhang.mcpelauncher;

//import org.mozilla.javascript.*;

import com.mojang.minecraftpe.MainActivity;

public class ScriptManager {

//	public static List<Context> scriptContexts = new ArrayList<Context>();

	public static void callScriptMethod(String functionName, Object... args) {
		//System.out.println(functionName + ":" + args);
	}

	public static void useItemOnCallback(int x, int y, int z, int itemid, int blockid) {
		callScriptMethod("useItem", x, y, z, itemid, blockid);
	}

	public static void setLevelCallback(boolean hasLevel) {
		System.out.println("Level: " + hasLevel);
		callScriptMethod("newLevel", hasLevel);
		if (MainActivity.currentMainActivity != null) {
			MainActivity main = MainActivity.currentMainActivity.get();
			if (main != null) {
				main.setLevelCallback();
			}
		}
	}

	public static void leaveGameCallback(boolean thatboolean) {
		callScriptMethod("leaveGame");
		if (MainActivity.currentMainActivity != null) {
			MainActivity main = MainActivity.currentMainActivity.get();
			if (main != null) {
				main.leaveGameCallback();
			}
		}
	}

	public static void init() {
		//set up hooks
		nativeSetupHooks();
	}

	public static native void nativeSetTile(int x, int y, int z, int id, int damage);

	public static native void nativeSetupHooks();
}
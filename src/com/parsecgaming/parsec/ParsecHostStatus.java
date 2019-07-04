package com.parsecgaming.parsec;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class ParsecHostStatus extends Structure {
	/** < The host is currently accepting guests after calling `ParsecHostStart`. */
	public byte running;
	/** < `true` if the host's `sessionID` has become invalid. */
	public byte invalidSessionID;
	/** < `true` if the virtual gamepad driver is working properly, otherwise `false`. */
	public byte gamepadSupport;
	/** < The current `serverID` assigned to the host. */
	public int serverID;
	/**
	 * < The currently active host settings.<br>
	 * C type : ParsecHostConfig
	 */
	public ParsecHostConfig cfg;
	public ParsecHostStatus() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("running", "invalidSessionID", "gamepadSupport", "serverID", "cfg");
	}
	/**
	 * @param running < The host is currently accepting guests after calling `ParsecHostStart`.<br>
	 * @param invalidSessionID < `true` if the host's `sessionID` has become invalid.<br>
	 * @param gamepadSupport < `true` if the virtual gamepad driver is working properly, otherwise `false`.<br>
	 * @param serverID < The current `serverID` assigned to the host.<br>
	 * @param cfg < The currently active host settings.<br>
	 * C type : ParsecHostConfig
	 */
	public ParsecHostStatus(byte running, byte invalidSessionID, byte gamepadSupport, int serverID, ParsecHostConfig cfg) {
		super();
		this.running = running;
		this.invalidSessionID = invalidSessionID;
		this.gamepadSupport = gamepadSupport;
		this.serverID = serverID;
		this.cfg = cfg;
	}
	public ParsecHostStatus(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends ParsecHostStatus implements Structure.ByReference {
		
	};
	public static class ByValue extends ParsecHostStatus implements Structure.ByValue {
		
	};
}
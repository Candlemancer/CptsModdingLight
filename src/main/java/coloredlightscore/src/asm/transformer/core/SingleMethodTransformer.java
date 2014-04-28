package coloredlightscore.src.asm.transformer.core;

import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.MethodNode;

/**
 * The SingleMethodTransformer.class was based on code written by diesieben07, who has given 
 * express permission for its use in our code.
 * 
 * diesieben07's code had not been classified under the GPL license at the time
 * before we had obtained a copy.
 * 
 * Please take that into consideration before copying it further.
 * (Meaning you'd need to adopt the GPL before you copy this outright, 
 *  as it's not technically under the WTFPL)
 * 
 * Source: https://github.com/diesieben07/SevenCommons/tree/master/src/main/java/de/take_weiland/mods/commons
 */

public abstract class SingleMethodTransformer extends MethodTransformer
{
	@Override
	protected final boolean transforms(ClassNode clazz, MethodNode method)
	{
		//return method.name.equals(getMcpMethod()) || ASMUtils.deobfuscate(clazz.name, method).equals(getSrgMethod());
		return NameMapper.getInstance().isMethod(method, getClassName(), getMcpMethod());
	}

	protected abstract String getClassName();

	
	protected abstract String getMcpMethod();
}
package com.jwebmp.plugins.quickforms.annotations.implementations;

import com.guicedee.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class QuickFormsAnnotationsExclusionsModule
		implements IGuiceScanModuleExclusions<QuickFormsAnnotationsExclusionsModule>
{
	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.quickforms.annotations");
		return strings;
	}
}

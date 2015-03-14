package com.elmakers.mine.bukkit.action.builtin;

import com.elmakers.mine.bukkit.action.BaseSpellAction;
import com.elmakers.mine.bukkit.api.action.CastContext;
import com.elmakers.mine.bukkit.api.magic.Mage;
import com.elmakers.mine.bukkit.api.spell.SpellResult;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.entity.Player;

import java.util.Collection;

public class MessageAction extends BaseSpellAction
{
	private String message = "";

    @Override
    public void prepare(CastContext context, ConfigurationSection parameters) {
        super.prepare(context, parameters);
        message = parameters.getString("message", "");
    }

	@Override
	public SpellResult perform(CastContext context) {
        Mage mage = context.getMage();
		Player player = mage.getPlayer();
		if (player == null) {
			return SpellResult.PLAYER_REQUIRED;
		}
        mage.sendMessage(message.replace("$spell", context.getSpell().getName()));
		return SpellResult.CAST;
	}

	@Override
	public void getParameterNames(Collection<String> parameters) {
		super.getParameterNames(parameters);
		parameters.add("message");
	}

	@Override
	public void getParameterOptions(Collection<String> examples, String parameterKey) {
		if (parameterKey.equals("message")) {
			examples.add("You cast $spell on $target");
		} else {
			super.getParameterOptions(examples, parameterKey);
		}
	}
}

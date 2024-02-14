package it.villager;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

public final class SmallLetterConvertor extends JavaPlugin {

    public SmallLetterConvertor plugin;

    @Getter
    private Convertor convertor;

    @Override
    public void onEnable() {
        this.plugin = this;
    }

    @Override
    public void onDisable() {
    }

    public String getInput(String input) {
        return input;
    }

    public String convert(String input) {
        return convertor.convertString(input);
    }

    public void getInstance() {
        convertor = new Convertor(this);
    }
}

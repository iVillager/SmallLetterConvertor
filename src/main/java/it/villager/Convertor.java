package it.villager;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Convertor {
    private static final Pattern COLOR_PATTERN = Pattern.compile("(&[a-fA-F0-9klmnor]|&#[0-9a-fA-F]{6}&)|<[^>]*>|\\{[^}]*\\}");
    private final Map<Character, String> characterMap = createCharacterMap();

    public String convertString(String input) {
        if (input == null) {
            return null;
        }

        StringBuilder result = new StringBuilder(input.length());
        Matcher matcher = COLOR_PATTERN.matcher(input);

        int lastEnd = 0;
        while (matcher.find()) {

            for (int i = lastEnd; i < matcher.start(); i++) {
                result.append(convertCharacter(input.charAt(i)));
            }

            result.append(input, matcher.start(), matcher.end());
            lastEnd = matcher.end();
        }

        for (int i = lastEnd; i < input.length(); i++) {
            result.append(convertCharacter(input.charAt(i)));
        }

        return result.toString();
    }

    private String convertCharacter(char character) {
        return characterMap.getOrDefault(character, String.valueOf(character));
    }

    private Map<Character, String> createCharacterMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('A', "ᴀ");
        map.put('B', "ʙ");
        map.put('C', "ᴄ");
        map.put('D', "ᴅ");
        map.put('E', "ᴇ");
        map.put('F', "ꜰ");
        map.put('G', "ɢ");
        map.put('H', "ʜ");
        map.put('I', "ɪ");
        map.put('J', "ᴊ");
        map.put('K', "ᴋ");
        map.put('L', "ʟ");
        map.put('M', "ᴍ");
        map.put('N', "ɴ");
        map.put('O', "ᴏ");
        map.put('P', "ᴘ");
        map.put('Q', "ǫ");
        map.put('R', "ʀ");
        map.put('S', "ꜱ");
        map.put('T', "ᴛ");
        map.put('U', "ᴜ");
        map.put('V', "ᴠ");
        map.put('W', "ᴡ");
        map.put('X', "x");
        map.put('Y', "ʏ");
        map.put('Z', "ᴢ");
        map.put('a', "ᴀ");
        map.put('b', "ʙ");
        map.put('c', "ᴄ");
        map.put('d', "ᴅ");
        map.put('e', "ᴇ");
        map.put('f', "ꜰ");
        map.put('g', "ɢ");
        map.put('h', "ʜ");
        map.put('i', "ɪ");
        map.put('j', "ᴊ");
        map.put('k', "ᴋ");
        map.put('l', "ʟ");
        map.put('m', "ᴍ");
        map.put('n', "ɴ");
        map.put('o', "ᴏ");
        map.put('p', "ᴘ");
        map.put('q', "ǫ");
        map.put('r', "ʀ");
        map.put('s', "ꜱ");
        map.put('t', "ᴛ");
        map.put('u', "ᴜ");
        map.put('v', "ᴠ");
        map.put('w', "ᴡ");
        map.put('x', "x");
        map.put('y', "ʏ");
        map.put('z', "ᴢ");
        return map;
    }


}

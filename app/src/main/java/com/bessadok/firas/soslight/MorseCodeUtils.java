package com.bessadok.firas.soslight;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MorseCodeUtils {
    
    private final Map<Character, MorseLetter> morseCode = new HashMap<Character, MorseLetter>();
    {
        morseCode.put('A', new MorseLetter(MorseCode.Point, MorseCode.Line));
        morseCode.put('B', new MorseLetter(MorseCode.Line, MorseCode.Point, MorseCode.Point, MorseCode.Point));
        morseCode.put('C', new MorseLetter(MorseCode.Line, MorseCode.Point, MorseCode.Line, MorseCode.Point));
        morseCode.put('D', new MorseLetter(MorseCode.Line, MorseCode.Point, MorseCode.Point));
        morseCode.put('E', new MorseLetter(MorseCode.Point));
        morseCode.put('F', new MorseLetter(MorseCode.Point, MorseCode.Point, MorseCode.Line, MorseCode.Point));
        morseCode.put('G', new MorseLetter(MorseCode.Line, MorseCode.Line, MorseCode.Point));
        morseCode.put('H', new MorseLetter(MorseCode.Point, MorseCode.Point, MorseCode.Point, MorseCode.Point));
        morseCode.put('I', new MorseLetter(MorseCode.Point, MorseCode.Point));
        morseCode.put('J', new MorseLetter(MorseCode.Point, MorseCode.Line, MorseCode.Line, MorseCode.Line));
        morseCode.put('K', new MorseLetter(MorseCode.Line, MorseCode.Point, MorseCode.Line));
        morseCode.put('L', new MorseLetter(MorseCode.Point, MorseCode.Line, MorseCode.Point, MorseCode.Point));
        morseCode.put('M', new MorseLetter(MorseCode.Line, MorseCode.Line));
        morseCode.put('N', new MorseLetter(MorseCode.Line, MorseCode.Point));
        morseCode.put('O', new MorseLetter(MorseCode.Line, MorseCode.Line, MorseCode.Line));
        morseCode.put('P', new MorseLetter(MorseCode.Point, MorseCode.Line, MorseCode.Line, MorseCode.Point));
        morseCode.put('Q', new MorseLetter(MorseCode.Line, MorseCode.Line, MorseCode.Point, MorseCode.Line));
        morseCode.put('R', new MorseLetter(MorseCode.Point, MorseCode.Line, MorseCode.Point));
        morseCode.put('S', new MorseLetter(MorseCode.Point, MorseCode.Point, MorseCode.Point));
        morseCode.put('T', new MorseLetter(MorseCode.Line));
        morseCode.put('U', new MorseLetter(MorseCode.Point, MorseCode.Point, MorseCode.Line));
        morseCode.put('V', new MorseLetter(MorseCode.Point, MorseCode.Point, MorseCode.Point, MorseCode.Line));
        morseCode.put('W', new MorseLetter(MorseCode.Point, MorseCode.Line, MorseCode.Line));
        morseCode.put('X', new MorseLetter(MorseCode.Line, MorseCode.Point, MorseCode.Point, MorseCode.Line));
        morseCode.put('Y', new MorseLetter(MorseCode.Line, MorseCode.Point, MorseCode.Line, MorseCode.Line));
        morseCode.put('Z', new MorseLetter(MorseCode.Line, MorseCode.Line, MorseCode.Point, MorseCode.Point));
        morseCode.put(' ', new MorseLetter(MorseCode.SPACE));
    }
}
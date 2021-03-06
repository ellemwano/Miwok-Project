package com.example.android.miwok;

/**
 * Created by ElleMwa on 03/12/2017.
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation an d a Miwok translation for that word.
 */

public class Word {

    /** Default translation of the word **/
    private String mDefaultTranslation;
    /** Miwok translation of the word **/
    private String mMiwokTranslation;

    /** Create a new Word object
     * @param defaultTranslation the word in the language the user is familiar with
     * @param miwokTranslation the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /** Get the default translation of the word **/
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /** Get the Miwok translation of the word **/
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}

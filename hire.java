import java.util.*;

class hire
    {
        public void TestForValidLanguage()
        {
            String languageWord = "HHIIRREEHHIIRREEHHIIRREEE";
            boolean isValid = IsValidLanguage(languageWord, "HIRE");
        }

        public boolean IsValidLanguage(String languageWords, String language)
        {
            int counter = 0;
            int languagelength = -1;

            int languageCounter = 0;
            for (int i = 0; i < languageWords.length(); i++)
            {
                if (languageWords.charAt(i) == language.charAt(languageCounter)
                { }

                else if (languageWords[i] == language[(languageCounter + 1) % language.length()])
                {
                    if (languagelength == -1)
                    {
                        languagelength = counter;
                    }

                    if (counter != languagelength)
                    {
                        return false;
                    }

                    languageCounter = (languageCounter + 1) % language.length();
                    counter = 0;
                }
                else
                {
                    return false;
                }
                counter++;
            }

            return counter == languagelength;

        }
    }
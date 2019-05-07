package pkgEnum;
import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	
	Easy(100), Medium(500), Hard(1000);

	private final Integer iDifficultyValue;
	
	private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();
	
	static {
        for (eGameDifficulty d : eGameDifficulty.values()) {
            lookup.put(d.getDifficulty(), d);
        }
    }

    private eGameDifficulty(Integer iDifficultyValue) {
        this.iDifficultyValue = iDifficultyValue;
    }

    public Integer getDifficulty() {
        return iDifficultyValue;
    }

    public static eGameDifficulty get(Integer iDifficultyValue) {
    	if(iDifficultyValue < 100) {
    		return null;
    	}
    	if(iDifficultyValue >= 100 && iDifficultyValue < 500) {
    		return lookup.get(100);
    	}
    	else if(iDifficultyValue >= 500 && iDifficultyValue < 1000) {
    		return lookup.get(500);
    	}
    	else {
    		return lookup.get(1000);
    	}
    }
    
    
}
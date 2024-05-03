/* 165. Compare Version Numbers */
/* https://leetcode.com/problems/compare-version-numbers/description/?envType=daily-question&envId=2024-05-03 */


class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
    final String[] level1 = version1.split("\\.");
    final String[] level2 = version2.split("\\.");
    final int length = Math.max(level1.length, level2.length);
        for(int i=0;i<length;++i){
            final Integer v1 = i<level1.length ? Integer.parseInt(level1[i]):0;
            final Integer v2 = i<level2.length ? Integer.parseInt(level2[i]):0;
            final int compare = v1.compareTo(v2);
            if(compare!=0)
            return compare;
        }
        return 0;
    }
}

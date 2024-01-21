public class Ex5 {
    public static void main(String[] Args){
        char[] aminoAcid =  {'A','C','D','E','F','G','H','I',
                             'K','L','M','N','P','Q','R','S','T','V','W','Y'};

        String proteinSequence = "GIVEQCCTSICSLYQL" +
                "ENYCNFVNQHLCGSHLVEALYLVCGERGFFY" +
                "TPKTNQHERGFFYTPKSICSLYQLVCGEVE" +
                "QCCTTSICSLYLCGSHRGFFYTLVECGEALY" +
                "LHERGICSLYQLENYCNFVNQHLCGSHLV" +
                "EALYLVCGERGFFYTPKTNQHERGFFYTP" +
                "KSICSLYQLVCGEVEQCCTTSICSLYLCG" +
                "SQCCTTSICSLYLCGSHRGFFYTLVECG" +
                "EALYLHERGICSLYQLENYCNFVNQHL";

        for(char amino : aminoAcid){
            int count = 0;
            for(char aminoCurrent : proteinSequence.toCharArray()){
                if(aminoCurrent==amino){
                    count++;
                }
            }
            System.out.println(amino +" : "+ count);
        }

    }
}

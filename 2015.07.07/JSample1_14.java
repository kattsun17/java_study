class JSample1_14 {
    public static void main (String args[]) {
        outside: for (int k = 1; k < 5; k++) {
            for (int j = 1; j < 5; j++) {
                if ( i * j > 10 ) {
                    break outside;
                }
            }
        }
    }
}

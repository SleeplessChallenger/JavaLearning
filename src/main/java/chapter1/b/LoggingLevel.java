package chapter1.b;

public enum LoggingLevel {
        PENDING(1, "A"), PROCESSED(2, "B"), PROCESSING(3, "C");

        private int val;
        private String strVal;

        private LoggingLevel(int val, String strVal) {
            this.val = val;
            this.strVal = strVal;
        }

        public int code() {
            return this.val;
        }

        public boolean isPending() {
            return this == PENDING;
        }

        public boolean isProcessing() {
            // `this` here is current value of the enum
            return this == PROCESSING;
        }
}

static class TestDataEmptyArray {
        public static int[] get_array() {
            // complete this function
            return new int[0];
        }
    }

    static class TestDataUniqueValues {
        public static int[] get_array() {
            // complete this function
            return new int[] {7,3,4,6,1};
        }

        public static int get_expected_result() {
            // complete this function
            return 4;
        }
    }

    static class TestDataExactlyTwoDifferentMinimums {
        public static int[] get_array() {
            // complete this function
            return new int[] {3,1,2,6,1};
        }

        public static int get_expected_result() {
            // complete this function
            return 1;
        }
    }

package Homework3.Task1;

public enum  Sizes {
    XXS(40){
        @Override
        public String getDescription() {
            return "XXS";
        }
    },
    XS(42){
        @Override
        public String getDescription() {
            return "XS";
        }
    },
    S(44){
        @Override
        public String getDescription() {
            return "S";
        }
    },
    M(46){
        @Override
        public String getDescription() {
            return "M";
        }
    },
    L(48){
        @Override
        public String getDescription() {
            return "L";
        }
    };
    private int euroSize;


    Sizes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return "Sizes{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }
}

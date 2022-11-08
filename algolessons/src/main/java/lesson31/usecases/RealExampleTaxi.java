package lesson31.usecases;

public class RealExampleTaxi {

    final static int MASK_BIG        = 0b00000001;
    final static int MASK_NONSMOKING = 0b00000010;
    final static int MASK_AIRCOND    = 0b00000100;
    final static int MASK_ANIMALS    = 0b00001000;

    int option = MASK_BIG | MASK_AIRCOND; // BIG + AIRCOND

}


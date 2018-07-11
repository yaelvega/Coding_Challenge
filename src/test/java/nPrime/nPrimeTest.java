package nPrime;

import org.junit.jupiter.api.Test;

import static nPrime.nPrime.nPrimeNumber;


class nPrimeTest {

    @Test
    void nPrime() {
        assert(nPrimeNumber(5) == 11);
        assert(nPrimeNumber(47) == 211);
        assert(nPrimeNumber(10001) == 104743);
    }

}
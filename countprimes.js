//Objective is to count the number of primes up to 'n'.

let n = 10


//O(nlognlogn) solution that uses the Sieve of Eratosthenes

let primes = new Array(n).fill(true)
primes[0] = false
primes[1] = false

for (let i = 2; i * i < n; i++) {
    if (primes[i]) {
        //Mark all multiples if 'i' false
        for (let j = i; j * i < n; j++) {
            primes[i * j] = false
        } 
    }
}

return primes.filter(boolean => boolean).length

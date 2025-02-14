class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False;

        result = str(x)
        resultArr = list(result)
        
        l = 0
        r = len(resultArr) - 1
        
        while l < r:
            if resultArr[l] != resultArr[r]:
                return False
            l += 1
            r -= 1

        return True
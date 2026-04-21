class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        new_s = sorted(list(s))
        new_t = sorted(list(t))
        return new_s==new_t


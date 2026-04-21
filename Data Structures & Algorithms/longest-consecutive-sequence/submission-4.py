class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        res = 0
        se = set(nums)
        for i in se:
            if (i-1) in se:
                continue
            else:
                length=0
                while (i+length) in se:
                    length += 1
                if length > res:
                    res = length
        return res
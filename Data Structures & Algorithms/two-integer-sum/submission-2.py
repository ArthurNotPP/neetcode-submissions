class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        difference = 0
        difsNeeded = {}
        key = 0
        for i in range(len(nums)):
            difsNeeded[i] = target - nums[i]

        for i in range(len(nums)):
            if nums[i] in difsNeeded.values():
                difference = nums[i]
                key = i

        for i in range(len(nums)):
            if target - difference == nums[i] and key != i:
                return [i, key]

        return [0, 0]
        
class Solution(object):
    def smallerNumbersThanCurrent(self, nums):
        results = []
        for i,v in enumerate(nums):
            temp = 0
            for j in range(len(nums)):
                if j == i:
                    continue
                else:
                    if nums[i] > nums[j]:
                        temp += 1
            if temp == 0:
                results.append(0)
            else:
                results.append(temp)
        return results

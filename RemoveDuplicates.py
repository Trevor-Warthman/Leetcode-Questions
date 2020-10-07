#Given a sorted array nums, remove the duplicates in-place such that each element appears only once and returns the new length.

#Shifts everything right of this index left by 1
def moveUp(arr, empty_index):
    return arr[:empty_index] + arr[(empty_index + 1):]
    
class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        i = 1
        length = len(nums)
        while(i < length):
            if(nums[i-1] == nums[i]):
                nums[:] = moveUp(nums,i) #Change the ELEMENTS of the list instead of the list itself in order to change the reference value without returning.
                length = length - 1
            else:
                i = i + 1
        return length
        

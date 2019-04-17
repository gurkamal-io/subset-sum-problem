# subset-sum-problem
The subset sum problem is an important decision problem in Computer Science that inherently has an exponential complexity. Given a data set of positive integers, the problem seeks to find a subset of those values whose sum meets a given target exactly, or as close as possible.

## Real World Applications

### Loading a Truck, Ship, or Plane
Shipping companies are always tyring to achieve efficiency by strategically loading packages into their vehicles. Of course the best scenario is to meet the vehicle's payload limit exactly. Since any finite weight can be expressed as an integer by converting to smaller units, the problem can be expressed as a subset sum problem with the target being the exact weight limit.

### Computer Authentication
Let's say a computer generates a large set of positive integers that get stored instead of a password. A password can then be stored as a subset of those integers by converting symbols to associated integers. When the user types in a password the computer can test whether its associated subset is a solution to the subset sum problem.

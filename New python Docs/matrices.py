# triangular matrices
from numpy import array
from numpy import tril
from numpy import triu
print("triangular matrix")
M = array([[1, 2, 3], [1, 2, 3], [1, 2, 3]])
print(M)
lower = tril(M)
print("\n",lower)
upper = triu(M)
print("\n",upper)


# diagonal matrix
print("\ndiagonal matrix")
from numpy import array
from numpy import diag
M = array([[1, 2, 3], [1, 2, 3], [1, 2, 3]])
print("\n",M)
# extract diagonal vector
d = diag(M)
print("\n",d)
# create diagonal matrix from vector
D = diag(d)
print("\n",D)


# identity matrix
from numpy import identity
I = identity(3)
print("\nidentity matrix")
print("\n",I)



# orthogonal matrix
from numpy import array
from numpy.linalg import inv
Q = array([[1, 0], [0, -1]])
print("\northogonal matrix")
print("\n",Q)
# inverse equivalence
V = inv(Q)
print("\n",Q.T)
print("\n",V)
# identity equivalence
I = Q.dot(Q.T)
print("\n",I)
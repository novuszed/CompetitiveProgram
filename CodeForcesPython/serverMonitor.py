__author__ = 'zihaozhu'
from sys import stdin
import psutil
import math
def b2g(bytes):
    return bytes>>30

mem = psutil.virtual_memory()
tempMem=[]
#print(mem)
for memSize in mem:
    #print(memSize)
    tempMem.append("{0:.2f}".format(int(memSize) /1073741824))
type = {"Total" : tempMem[0], "Available":tempMem[1], "Percent Used":tempMem[2], "Used Memory":tempMem[3],
        "Free Memory":tempMem[4], "Active":tempMem[5], "inActive":tempMem[6], "Wired":tempMem[7]
        }
#print(type)

for proc in psutil.process_iter():
    try:
        pinfo = proc.as_dict(attrs=['pid', 'name'])
    except psutil.NoSuchProcess:
        pass
    else:
        print(pinfo)


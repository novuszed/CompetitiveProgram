__author__ = 'zihaozhu'

def main():
    file = open("intervals.txt")

    points = []
    for line in file:
        l = line.split()
        points.append((int(l[0]), int(l[1])))


    points.sort(key=lambda i: i[0])
    #print(points)
    i=0
    while(i!=len(points)-1):
        lowerBound = points[i][0]
        upperBound = points[i][1]

        if((points[i+1][0]>=lowerBound and points[i+1][0]<=upperBound) or (points[i+1][1]>=lowerBound and points[i+1][1]<=upperBound)):

            if(points[i+1][0]<points[i][0]):
                lowerBound = points[i+1][0]
            if(points[i+1][1]>points[i][1]):
                upperBound = points[i+1][1]
           # print(lowerBound)
            #print(upperBound)
            points[i]=(lowerBound, upperBound)

            points.pop(i+1)
        else:
            i+=1
    print("Non-intersecting Intervals:")
    for pts in points:
        print(pts)

    points.sort(key=lambda i: i[1]-i[0])
    print("Non-intersecting Intervals in order of size:")
    for pts in points:
        print (pts)
main()
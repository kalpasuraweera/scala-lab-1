@main def main = println(totalRunTime())


def easyRunTime(distance:Double):Double = 8*distance

def tempoRunTime(distance:Double):Double = 7*distance

def totalRunTime():Double = easyRunTime(2) + tempoRunTime(3) + easyRunTime(2)
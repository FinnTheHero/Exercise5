# Padding function
def padding(size, padding):
    def paddedString(s):
        if padding == "left":
            return s.ljust(size)
        elif padding == "center":
            return s.center(size)
        elif padding == "right":
            return s.rjust(size)
        else:
            raise ValueError("Invalid padding option")

    return paddedString

# Create functions with specific size and padding
padLeft = padding(30, "left")
padCenter = padding(30, "center")
padRight = padding(30, "right")

# Random test words
words = ["Python", "Closure", "Example", "Padding"]

# Demonstrate the functions
for word in words:
    print(f"Original word: {word}")
    print(f"Left Padded word: {padLeft(word)}")
    print(f"Center Padded word: {padCenter(word)}")
    print(f"Right Padded word: {padRight(word)}")
    print() # Add empty line at the end of each cycle
def solve(commands):
    contents_dict = {}
    i = 0
    file_name = ""
    contents = ""
    reading_contents = False
    while i < len(commands):
        command = commands[i]
        if i < len(commands) - 1:
            if reading_contents:
                if command == ":wq":
                    reading_contents = False
                    contents_dict[file_name] = contents
                    contents = ""
                else:
                    contents += command + "\n"
            else:
                file_name = command[3:]
                reading_contents = True
        else:
            file_name = command[4:]
            return contents_dict[file_name]
        i += 1

commands = []

for i in range(int(input())):
    commands.append(input())

print(solve(commands))
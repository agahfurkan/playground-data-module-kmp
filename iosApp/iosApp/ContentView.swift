import UIKit
import SwiftUI
import ComposeApp

struct ContentView: View {
    var body: some View {
        VStack {
            Button("Get Users") {
                Task {
                    let userRepository = UserRepository()
                    do {
                        let users = try await userRepository.getUsers()
                        print("Users: \(users)")
                    } catch {
                        print("Error fetching users: \(error)")
                    }
                }
            }
            ComposeView()
                .ignoresSafeArea(.all) // Compose has own safe area handling
        }
    }
}




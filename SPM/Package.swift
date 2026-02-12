// swift-tools-version:5.7
// SPM/Package.swift

import PackageDescription

let package = Package(
    name: "Shared",
    platforms: [
        .iOS(.v14)
    ],
    products: [
        .library(
            name: "Shared",
            targets: ["Shared"])
    ],
    targets: [
        .binaryTarget(
            name: "Shared",
            path: "./shared.xcframework" // Points to the framework in the same folder
        )
    ]
)
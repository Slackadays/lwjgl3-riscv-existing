/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_viewport_array2 = "NVViewportArray2".nativeClassVK("NV_viewport_array2", type = "device", postfix = "NV") {
    documentation =
        """
        This extension adds support for the following SPIR-V extension in Vulkan:

        <ul>
            <li>{@code SPV_NV_viewport_array2}</li>
        </ul>

        which allows a single primitive to be broadcast to multiple viewports and/or multiple layers. A new shader built-in output {@code ViewportMaskNV} is provided, which allows a single primitive to be output to multiple viewports simultaneously. Also, a new SPIR-V decoration is added to control whether the effective viewport index is added into the variable decorated with the {@code Layer} built-in decoration. These capabilities allow a single primitive to be output to multiple layers simultaneously.

        This extension allows variables decorated with the {@code Layer} and {@code ViewportIndex} built-ins to be exported from vertex or tessellation shaders, using the {@code ShaderViewportIndexLayerNV} capability.

        This extension adds a new {@code ViewportMaskNV} built-in decoration that is available for output variables in vertex, tessellation evaluation, and geometry shaders, and a new {@code ViewportRelativeNV} decoration that can be added on variables decorated with {@code Layer} when using the {@code ShaderViewportMaskNV} capability.

        When using GLSL source-based shading languages, the {@code gl_ViewportMask}[] built-in output variable and {@code viewport_relative} layout qualifier from {@code GL_NV_viewport_array2} map to the {@code ViewportMaskNV} and {@code ViewportRelativeNV} decorations, respectively. Behaviour is described in the {@code GL_NV_viewport_array2} extension specification.

        <div style="margin-left: 26px; border-left: 1px solid gray; padding-left: 14px;"><h5>Note</h5>
        The {@code ShaderViewportIndexLayerNV} capability is equivalent to the {@code ShaderViewportIndexLayerEXT} capability added by {@link EXTShaderViewportIndexLayer VK_EXT_shader_viewport_index_layer}.
        </div>

        <h5>VK_NV_viewport_array2</h5>
        <dl>
            <dt><b>Name String</b></dt>
            <dd>{@code VK_NV_viewport_array2}</dd>

            <dt><b>Extension Type</b></dt>
            <dd>Device extension</dd>

            <dt><b>Registered Extension Number</b></dt>
            <dd>97</dd>

            <dt><b>Revision</b></dt>
            <dd>1</dd>

            <dt><b>Contact</b></dt>
            <dd><ul>
                <li>Daniel Koch <a target="_blank" href="https://github.com/KhronosGroup/Vulkan-Docs/issues/new?body=[VK_NV_viewport_array2]%20@dgkoch%250A*Here%20describe%20the%20issue%20or%20question%20you%20have%20about%20the%20VK_NV_viewport_array2%20extension*">dgkoch</a></li>
            </ul></dd>
        </dl>

        <h5>Other Extension Metadata</h5>
        <dl>
            <dt><b>Last Modified Date</b></dt>
            <dd>2017-02-15</dd>

            <dt><b>Interactions and External Dependencies</b></dt>
            <dd><ul>
                <li>This extension requires <a target="_blank" href="https://htmlpreview.github.io/?https://github.com/KhronosGroup/SPIRV-Registry/blob/master/extensions/NV/SPV_NV_viewport_array2.html">{@code SPV_NV_viewport_array2}</a></li>
                <li>This extension provides API support for <a target="_blank" href="https://registry.khronos.org/OpenGL/extensions/NV/NV_viewport_array2.txt">{@code GL_NV_viewport_array2}</a></li>
                <li>This extension requires the {@code geometryShader} and {@code multiViewport} features.</li>
                <li>This extension interacts with the {@code tessellationShader} feature.</li>
            </ul></dd>

            <dt><b>Contributors</b></dt>
            <dd><ul>
                <li>Piers Daniell, NVIDIA</li>
                <li>Jeff Bolz, NVIDIA</li>
            </ul></dd>
        </dl>
        """

    IntConstant(
        "The extension specification version.",

        "NV_VIEWPORT_ARRAY_2_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "NV_VIEWPORT_ARRAY_2_EXTENSION_NAME".."VK_NV_viewport_array2"
    )

    IntConstant(
        "The extension specification version.",

        "NV_VIEWPORT_ARRAY2_SPEC_VERSION".."VK_NV_VIEWPORT_ARRAY_2_SPEC_VERSION"
    )

    StringConstant(
        "The extension name.",

        "NV_VIEWPORT_ARRAY2_EXTENSION_NAME".expr("VK_NV_VIEWPORT_ARRAY_2_EXTENSION_NAME")
    )
}